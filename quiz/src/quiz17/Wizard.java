package quiz17;

public class Wizard extends Player{
	
	//name은 전달받아서 초기화, hp = 500, mp = 1000, attack = 20, armor = 3
	
	Wizard(String name) {
		this.name = name;
		this.hp = 500;
		this.mp = 1000;
		this.attack = 20;
		this.armor = 3;
	}
	
	void iceArrow() {
		System.out.println("얼음 화살 사용");
	}
	
	public void blizzard(Player[]players) {
		System.out.println("--------------------------------");
		System.out.println(this.name+"님의 눈보라 시전!");
		for(Player p:players) {
			int d=(int)(Math.random()*6+10);
			System.out.println(p.name+"님이 "+d+"피해를 입었습니다");
			p.hp-=d;
		}
	}
}
