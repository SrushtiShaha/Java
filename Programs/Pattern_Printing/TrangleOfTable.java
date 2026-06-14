class Main {
    public static void main(String[] args) {
        int n = 10, m = 11, i = 1, j = 1, cnt = 3, no = 1, table = 0, c1 = 0, c2 = 0, tab1 = cnt * 10, z = 2;
        for(i = 1; i <= n; i++) {
            for(j = 1; j <= n; j++) {
                if(i+j == n+1) {
                    table = cnt * no;
                    if(i == 1) {
                        System.out.print("       " + table);
                    }
                    else {
                        System.out.print("     " + table);
                    }
                    no++;
                }
                else if(i == n) {
                    c1++ ;
                    tab1 = tab1 - cnt;
                    if(c1 <= 10) {
                        System.out.print("  " + tab1);
                    }
                }
                else {
                    System.out.print("    ");
                }
            }
            int tab2 = cnt;
            if(i != 1) {
                for(j = 1; j <= m; j++) {
                    if(i == j) {
                        System.out.print("  " + table);
                    }
                    else if(i == n) {
                        c2++;
                        tab2 = cnt * z;
                        if(c2 < 9) {
                            System.out.print("   " + tab2);
                            z++;
                        }
                    }
                    else {
                        System.out.print("    ");
                    }
                }
            }
            System.out.println();
        }
    }
}