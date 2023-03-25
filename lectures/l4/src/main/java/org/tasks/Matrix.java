public class Matrix {
    int m;
    int n;
    double[][] twoDM;
    public void Matrix(int m, int n){
        this.m = m;
        this.n = n;
        this.twoDM = new double[m][n];
    }
    public void SetValue(int i, int j, double value){
        this.twoDM[i][j] = value;
    }

    public void Sum(Matrix mat){
        if (mat.m == m && mat.n == n){
            for (int i = 0; i< m; i++){
                for (int ii = 0; ii < n; ii++){
                    twoDM[i][ii] += mat.twoDM[i][ii];
                }
            }
        } else {
            System.out.println("Сложение невозможно");
        }
    }

    public void Mult(double d){
        for (int i = 0; i < m; i++){
            for (int ii = 0; ii < n; ii++){
                twoDM[i][ii] *= d;
            }
        }
    }

    public void MultMat(Matrix mat){
        if (m == mat.n) {
            double[][] arr = new double[mat.m][n];
            for (int i = 0; i < mat.m; i++){
                for (int ii = 0; ii < n; ii++){
                    for (int i3 = 0; i3 < m; i3++){
                        arr[i][ii] += twoDM[i3][ii] * mat.twoDM[i][i3];
                    }
                }
            }
            m = mat.m;
            twoDM = arr;
        } else if (n == mat.m){
            double[][] arr = new double[m][mat.n];
            for (int i = 0; i < m; i++){
                for (int ii = 0; ii < mat.n; ii++){
                    for (int i3 = 0; i3 < n; i3++){
                        arr[i][ii] += twoDM[i][i3] * mat.twoDM[i3][ii];
                    }
                }
            }
            n = mat.n;
            twoDM = arr;
        } else {
            System.out.println("Умножение невозможно");
        }
    }

    public String toString(){
        String sm = "";
        for (int i = 0; i < m; i++){
            for (int ii = 0; ii < n; ii++){
                sm = sm + twoDM[i][ii] + " ";
            }
            sm = sm + "\n";
        }
        return sm;
    }
}
