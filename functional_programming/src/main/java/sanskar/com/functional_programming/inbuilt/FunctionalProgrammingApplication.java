package sanskar.com.functional_programming.inbuilt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@FunctionalInterface
interface BookAction {
	void perform();
}

@FunctionalInterface
interface operation {
	int add(int a , int b);
}

// parameter -> expression body
//        () -> {}

@SpringBootApplication
public class FunctionalProgrammingApplication {

	public static void main(String[] args) {
		SpringApplication.run(FunctionalProgrammingApplication.class, args);

//       step1
		operation op = new operation() {
			@Override
			public int add(int a, int b) {
				return a - b;
			}
		};
		op.add(9, 8);

//		 step2
		operation op1 = (int a, int b) -> {
			return a + b;
		};
		op1.add(5, 6);

//		 step3
		operation op2 = (int a, int b) -> a * b;
		System.out.println(op2.add(5, 6));

		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Thread is running");
			}
		}).start();

		new Thread(()->{System.out.println("hello thread");}).start();
	}
}
