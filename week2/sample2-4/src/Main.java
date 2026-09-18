void main() {
    Scanner keyboard = new Scanner(System.in);
    String name;
    int age;
    float height;
    double weight;

    System.out.print("당신의 이름은 ? ");
    name = keyboard.nextLine();

    System.out.print("당신의 나이은 ? ");
    age = keyboard.nextInt();

    System.out.print("당신의 키는 ? ");
    height = keyboard.nextInt();

    System.out.print("당신의 몸무게는 ? ");
    weight = keyboard.nextDouble();

    System.out.printf("%s님의 나이는 %d살 입니다.\n", name, age);
    System.out.printf("%s님의 키는 %.1f CM 입니다.\n", name, height);
    System.out.printf("%S님의 몸무게는 %.1f Kg 입니다.\n", name, weight);
}
