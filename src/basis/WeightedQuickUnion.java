package basis;

/**
 * @package: basis
 * @Author: 陈淼
 * @Date: 2016/8/27
 * @Description: 算法1.5 union-find的quick-union算法的实现（加权），
 *               原理是每个触点所对应的id[]元素都是同一个分量中的另一个触点的名称（也可能是它自己）
 */
public class WeightedQuickUnion {
    private int[] id;   //父链接数组(以触点作为索引)
    private int[] sz;   //(以触点作为索引的)各个根节点所对应的分量的大小
    private int count;  //连通分量的数量
    public WeightedQuickUnion(int N){
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++){
            id[i] = i;
        }
        sz = new int[N];
        for (int i = 0; i < N; i++){
            sz[i] = i;
        }
    }
    public int count(){
        return count;
    }
    public int find(int p){
        //跟随链接找到根节点
        while (p != id[p]){
            p = id[p];
        }
        return p;
    }
    public boolean connected(int p, int q){
        return find(p) == find(q);
    }
    public void union(int p, int q){
        //将p和q的根节点统一
        int pRoot = find(p);
        int qRoot = find(q);
        if (pRoot == qRoot){
            return;
        }
        //将小树的根节点连接到大树的根节点
        if (sz[pRoot] < sz[qRoot]) {
            id[pRoot] = qRoot;
            sz[qRoot] += sz[pRoot];
        }else {
            id[qRoot] = pRoot;
            sz[pRoot] += sz[qRoot];
        }
        count--;
    }
}
