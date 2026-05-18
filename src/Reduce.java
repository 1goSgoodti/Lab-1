class Reduce {

    public static void main(String[] args) {
        System.out.print(Reduce.main(1));
    }

    public static int main(int n) {
        int count = 0;
        int num = n;
        while (num > 0) {
            if (num % 2 == 0) {
                count++;
                num = num / 2;
            }
            else {
                count++;
                num--;
            }
        }
        return count;
    }

}