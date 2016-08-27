package basis;

/**
 * @package: basis
 * @Author: 陈淼
 * @Date: 2016/8/27
 * @Description: 算法1.5 union-find的quick-find算法的实现，原理是将两个触点所对应的id[]元素变为同一个值
 */
public class QuickFind {
    private int[] id;   //分量id(以触点作为索引)
    private int count;  //分量数量
    public QuickFind(int N){
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++){
            id[i] = i;
        }
    }
    public int count(){
        return count;
    }
    public int find(int p){
        return id[p];
    }
    public boolean connected(int p, int q){
        return find(p) == find(q);
    }
    public void union(int p, int q){
        int pID = find(p);
        int qID = find(q);

        if (pID == qID){
            return;
        }

        for (int i = 0; i < id.length; i++){
            if (id[i] == pID){
                id[i] = qID;
            }
        }
        count--;
    }
}
