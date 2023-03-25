public class task3 {
    public static void main(String[] args) {
        Matrix mat = new Matrix();
        mat.Matrix(5, 4);
        mat.SetValue(2,3, 42.8);
        mat.SetValue(4,1, 4);
        mat.SetValue(0,0, 48.1245);
        mat.SetValue(3,2, 750);
        mat.SetValue(1,0, 16.248);
        System.out.println("Матрица 1:");
        System.out.println(mat);
        Matrix mat2 = new Matrix();
        mat2.Matrix(2, 2);
        mat2.SetValue(0, 0, 12.5);
        mat2.SetValue(0, 1, 42.35);
        mat2.SetValue(1, 0, 1);
        mat2.SetValue(1, 1, 45.78);
        System.out.println("Матрица 2:");
        System.out.println(mat2);
        Matrix mat3 = new Matrix();
        mat3.Matrix(2, 2);
        mat3.SetValue(0, 0, 1.45);
        mat3.SetValue(0, 1, 28.75);
        mat3.SetValue(1, 0, 14.96);
        mat3.SetValue(1, 1, 45.21);
        System.out.println("Матрица 3:");
        System.out.println(mat3);
        mat2.Sum(mat3);
        System.out.println("Матрица 2 после суммы с третьей:");
        System.out.println(mat2);
        mat2.Mult(13.27);
        System.out.println("Матрица 2 после перемножения на 13.27 :");
        System.out.println(mat2);
        Matrix mat4 = new Matrix();
        mat4.Matrix(1, 2);
        mat4.SetValue(0, 0, 1.45);
        mat4.SetValue(0, 1, 28.75);
        System.out.println("Матрица 4:");
        System.out.println(mat4);
        mat2.MultMat(mat4);
        System.out.println("Матрица 2 после перемножения с четвёртой:");
        System.out.println(mat2);
    }
}