package lol;

import java.lang.reflect.Array;
import java.util.Map;

// class는 설계도 ( 요네 )
// 요네는 정의만 되어있음.
public class 요네 {

	// private : 프라이버시 ( 나만의공간, 접근 못함 )
	private String move; // 내 프라이버시, 접근제어자 ( 접근못함 ) , 나만 사용가능
				// 접근이 안됬었는데 getter/setter로 접근가능
	// 스펠이라는게 2개잖아
	
	// ✔ 자료구조
	// 1 ) 배열(List)은 중복가능 { 1,2,3,4,6,6,6,6,6,6,};
	// 2 ) 셋 ( Set ) - List인데 중복이 안됨. 중복 안되는 배열이라 생각
	// 3 ) Map - key : value 쌍임 Key 중복 X 
	//  testMap.put("young", "rr");
	//	testMap.put("kim", "rr");
	//	testMap.put("yoo123", "rr");
	
	private Map<String, String> spell;
	
	private String attack;
	
	public String 버그;

	
	public String getMove() { // 핸드폰에 사진찍어서 보여줌
		return this.move;
	}

	public void setMove(String move) {
		this.move = move;
		// this : private에 있는 move
		// move = "위로";
	}

	public Map<String, String> getSpell() {
		return spell;
	}

	public void setSpell(Map<String, String> spell) {
		this.spell = spell;
	}

	public String getAttack() {
		return attack;
	}

	public void setAttack(String attack) {
		this.attack = attack;
	}

	public String get버그() {
		return 버그;
	}

	public void set버그(String 버그) {
		this.버그 = 버그;
	}
	
	 
			
	
	
	
}
