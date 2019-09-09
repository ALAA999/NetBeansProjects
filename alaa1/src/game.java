class game{
    int n;

game(){

}
void print(int a){
    
     for (int i = 0; i < 3; ++i) {
                for (int c = 0; c < 3; ++c) {
                    for(int v=0;v<a;++v){
                        System.out.print("\t\t\t");}
                    System.out.println("  *  ");}
                
                System.out.println("");
            }
             
}