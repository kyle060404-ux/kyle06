void main() {
    short test1 = 32767;
    short test2 = 1;
    short result = (short) (test1 + test2); // 캐스트 연산자

    System.out.printf("%,d * %,d = %,d\n", test1, test2, result);
}
