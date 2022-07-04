cprod=1;
             for (int i = a.length-1; i >=0 ; i--) {
                cprod*=a[i];
                product_max = Math.max(product_max, cprod);
                if (cprod==0) {
                    cprod=1;
                }
            }