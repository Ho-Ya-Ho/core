package hello.core.singleton;

//Spring에서는 자동으로 Singleton을 적용해 준다. 그래서 AppConfig에서 하나하나 Singleton을 적용하지 않아도 된다.
public class SingletonService {

    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance(){
        return instance;
    }

    private SingletonService() {
    }

    public void logic(){
        System.out.println("싱글톤 객체 로직 호출");
    }
}
