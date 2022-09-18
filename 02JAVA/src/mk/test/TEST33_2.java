package mk.test;

public class TEST33_2 {

	public static void main(String[] args) {
		ProductManager pm = new ProductManager();
		pm.play();
	}
	// Product 클래스
	// 등록한 삼품개수 저장
	// 상품명
	// 재고수량
	// 재고 추가
	// 재고 소진
	// 재고 내용
	// ProductManager클래스 - 상품들을 관리하는 프로그램

	public static int kindCount = 0;
	public String name = null;
	public int count = 0;

	public TEST33_2(String name, int count) {
		this.name = name;
		this.count = count;
		TEST33_2.kindCount++;
	}

	public void add(int count) {
		this.count += count;
	}

	public void minus(int count) {
		this.count -= count;
	}

	public String toString() {
		return "제품명:" + name + " 남은개수:" + count;
	}

}

class ProductManager {
	public static java.util.Scanner sc = new java.util.Scanner(System.in);
	public TEST33_2[] pList = new TEST33_2[10];

	public ProductManager() {
		pList[0] = new TEST33_2("새우깡", 100);
		pList[1] = new TEST33_2("오징어땅콩", 100);
		pList[2] = new TEST33_2("세탁기", 100);
		pList[3] = new TEST33_2("냉장고", 100);
	}

	public void printAll() {
		for (int i = 0; i < TEST33_2.kindCount; i++) {
			System.out.println(pList[i]);
		}
	}

	public void insertProduct(String name, int count) {
		pList[TEST33_2.kindCount] = new TEST33_2(name, count);
	}

	public void deleteProduct(int deleteIndex) {
		if (deleteIndex >= 0 && deleteIndex < TEST33_2.kindCount) {
			for (int i = deleteIndex; i < TEST33_2.kindCount - 1; i++) {
				pList[i] = pList[i + 1];
			}
			TEST33_2.kindCount--;
		} else {
			System.out.println("잘못된 인덱스 입력");
		}
	}

	public void deleteProduct(String name) {
		int index = -1;
		for (int i = 0; i < TEST33_2.kindCount; i++) {
			if (pList[i].name.equals(name)) {
				index = i;
			}
			;
		}
		deleteProduct(index);
	}

	public void addProductCount(String inputPName, int inputPcount) {
		for (int i = 0; i < TEST33_2.kindCount; i++) {
			if (pList[i].name.equals(inputPName)) {
				pList[i].add(inputPcount);
			}
		}
	}

	public void minusProductCount(String inputPName, int inputPcount) {
		for (int i = 0; i < TEST33_2.kindCount; i++) {
			if (pList[i].name.equals(inputPName)) {
				pList[i].minus(inputPcount);
			}
		}
	}

	public void play() {
		boolean isFlag = true;
		while (isFlag) {
			System.out.println("1. 전체목록 2. 상품추가 3. 상품삭제 4. 제고추가 5. 제고삭제 6. 종료 >>");
			String selectMenu = sc.nextLine();
			switch (selectMenu) {
			case "1":
				System.out.println("전체 상품개수" + TEST33_2.kindCount);
				printAll();
				System.out.println("계속진행하려면 엔터 입력");
				sc.nextLine();
				break;
			case "2":
				System.out.println("입력하고자 하는 제품명 입력>>");
				String inputName = sc.nextLine();
				System.out.println("입력하고자하는 수량입력>>");
				int inputCount = Integer.parseInt(sc.nextLine());
				insertProduct(inputName, inputCount);
				break;
			case "3":
				System.out.println("삭제할 품명 입력>>");
				inputName = sc.nextLine();
				deleteProduct(inputName);
				break;
			case "4":
				System.out.println("입력하고자하는 품명 >>");
				inputName = sc.nextLine();
				System.out.println("입력하조가 하는 수량 입력>>");
				inputCount = Integer.parseInt(sc.nextLine());
				addProductCount(inputName, inputCount);
				break;
			case "5":
				System.out.println("입력하고자 하는 제품명입력>>");
				inputName = sc.nextLine();
				System.out.println("입력하고자 하는 수량 입력>>");
				inputCount = Integer.parseInt(sc.nextLine());
				minusProductCount(inputName, inputCount);
				break;
			case "6":
				isFlag = false;
				System.out.println("종료");
				break;
			default:
				System.out.println("Error");
			}
		}
	}
}
