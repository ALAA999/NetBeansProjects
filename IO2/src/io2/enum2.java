class en{
    public enum name{
        zozo(0),alaa(1),momo(2);
        int i;
        private name(int num){
            this.i = num;
        }
    }
    public static void main(String[] args) {
        Object []a = name.values();
        for (int i = 0; i < 3; i++) {
            System.out.println(a[i]);
        }
        /*for (name a : name.values()) {
            System.out.println(a);
        }*/
}
}