package domain.service;

/**
 * 課題実装部
 */
public class TaskServiceImplementedBy660 implements ITask {
    // 問１
    @Override
    public void learnJavaMechanism() {
            System.out.println("JavaプログラムはJavaバイトコードと呼ばれる中間言語（中間表現）にコンパイルされて、Java仮想マシンと呼ばれるソフトウェア上で実行される。各コンピュータ環境に対応したJava仮想マシンがハードウェア間の差異を吸収し、特定の環境に依存しないプログラム動作を実現する仕組みとなっている。");
    }

    // 問２
    @Override
    public void learnVariable() {
        int x = 3;
        int y = 5;
        int z;

        z = x * y;

        System.out.println(z);

    }


    // 問３
    @Override
    public void learnConstant() {
        double shouhizei = 0.08;
        int x;

        x = 100;
        x += x * shouhizei;

        System.out.println(x);
    }

    // 問４
    @Override
    public void learnDataType() {
        boolean x = true;
        char y = '侍';
        double z = 3.14;
        long a = 314159265853979L;
        String b = "為せば成る 為さねば成らぬ 何事も 成らぬは人の 為さぬなりけり";

        System.out.println(x + "\n" + y + "\n" + z + "\n" + a + "\n" + b + "\n");


    }
}
