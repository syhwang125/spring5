# 1. Strategy Pattern (전략패턴) 

## Interface : 기능에 대한 선언과 구현을 분리. 기능을 사용하기 위한 통로
## Delegator : 특정 객체의 기능을 사용하기 위해 다른 객체의 기능을 호출
## Strategy Pattern : 여러 알고리즘을 하나의 추상적인 접근점을 만들어 접근점에서 서로 교환가능하도록 하는 패턴

    예제) 게임, 캐릭터와 무기 (칼, 총, 검)
    Interface weapon { 
        attack(); 
    } 
    Class Sword implements weapon { attack(); }
    Class Knife implements weapon { attack(); }
    Class GameCharacter {
      setWeapon(Weapon);
      attack(); 
    }
  
  # 2. Adapter Pattern

  ### 이미 구현되어 있는 코드에는 B라는 형식으로 구현되어 있을때 B를 A의 형식으로 바꾸면 써먹을 수 있는 경우.
  ### adapter패턴은 어떤 오브젝트를 캐스팅이 불가능한 다른 클래스의 형태로 변환시켜 주는 것 
  ### interface 에 정의된 메소드를 AdapterImpl 클래스에서 override 하여 알고리즘에 맞게 변경해서 사용할 수 있다. 

    예제 )
    Interface Adapter {
        twiceOf(double) ;
        halfOf(double);
    }
    Class AdapterImpl implements Adapter {
	    twiceOf(float);
        halfOf(float);
    }

# 3. Template Method Pattern 

### 알고리즘의 구조를 메소드에 정의하고 하위클래스에서 알고리즘 구조의 변경없이 알고리즘을 재정의하는 패턴 
### 일정한 프로세스를 가진 요구사항을 템플릿 메소드 패턴을 이용하여 구현할 수 있다.
