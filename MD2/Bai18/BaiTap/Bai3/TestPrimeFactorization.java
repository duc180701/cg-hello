package MD2.Bai18.BaiTap.Bai3;

public class TestPrimeFactorization {
    public static void main(String[] args) {
        LazyPrimeFactorization lazy = new LazyPrimeFactorization("Lazy", 100);
        OptimizedPrimeFactorization optimized = new OptimizedPrimeFactorization("Optimized", 100);

        lazy.start();
        optimized.start();
    }
}
