#include <bits/stdc++.h>
using namespace std;

#define ll long long

vector<ll> seg;

// Build segment tree
void build(vector<ll>& arr, int node, int start, int end) {
    if (start == end) {
        seg[node] = arr[start];
        return;
    }
    int mid = (start + end) / 2;
    build(arr, 2*node, start, mid);
    build(arr, 2*node+1, mid+1, end);
    seg[node] = seg[2*node] + seg[2*node+1];
}

void update(int node, int start, int end, int idx, ll val) {
    if (start == end) {
        seg[node] = val;
        return;
    }
    int mid = (start + end) / 2;
    if (idx <= mid)
        update(2*node, start, mid, idx, val);
    else
        update(2*node+1, mid+1, end, idx, val);

    seg[node] = seg[2*node] + seg[2*node+1];
}

    if (r < start || end < l)
        return 0;

    if (l <= start && end <= r)
        return seg[node];
    int mid = (start + end) / 2;
    ll left = query(2*node, start, mid, l, r);
    ll right = query(2*node+1, mid+1, end, l, r);

    return left + right;
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);

    int n, q;
    cin >> n >> q;

    vector<ll> arr(n+1);
    for (int i = 1; i <= n; i++) {
        cin >> arr[i];
    }

    seg.resize(4*n);

    build(arr, 1, 1, n);

    while (q--) {
        int type;
        cin >> type;

        if (type == 1) {
            int k;
            ll u;
            cin >> k >> u;
            update(1, 1, n, k, u);
        } else {
            int a, b;
            cin >> a >> b;
            cout << query(1, 1, n, a, b) << "\n";
        }
    }

    return 0;
}
