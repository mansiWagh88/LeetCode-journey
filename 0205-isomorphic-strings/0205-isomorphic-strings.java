class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[]s1=new int[256];
        int[]t1=new int[256];
        int n=s.length();
        for(int i=0;i<n;i++){
            if(t1[t.charAt(i)]!=s1[s.charAt(i)]){
                return false;
            }
            s1[s.charAt(i)]=i+1;
            t1[t.charAt(i)]=i+1;
        }
        return true;
    }
}