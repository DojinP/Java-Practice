package thread.sync;
// 공유객체 - 계좌이체에 필요한 두 계좌의 정보를 저장하고 있는 객체
// - 계좌 이체하는 쓰레드
// - 계좌의 잔액을 더하는 쓰레드
public class Obj {
	Account acc1; // 김서연계좌 - 이체를 받을 계좌
	Account acc2; // BTS계좌 - 이체할 계좌
}
