# 9주차 - 1강 SOLID

### SOLID (객체 지향 설계)
* 객체지향설계의 원칙임
  * SRP (Single Responsibility Principle, 단일 책임 원칙)
    * 한 클래스는 단 하나의 변경 이유만 가져야함 
  * OCP (Open-Closed Principle, 개방-폐쇄 원칙)
    * 하나의 클래스가 어쩔 때는 열리고/어쩔 때는 닫혀야함
    * 확장에 대해서는 열려있고
    * 다른 곳에 영향을 주면 안되니 이쪽에서는 닫혀있어야함
    * 보통 추상화(인터페이스 등)를 통해서 해결함
  * LSP (Liskov Substitution Principle, 리스코프 치환 원칙)
    * 자식은 부모의 타입으로 치환 가능해야함
  * ISP (Interface Segregation Principle, 인터페이스 분리 원칙)
    * 하나의 구현이 여러 인터페이스를 구현할 수 있고, 하나의 인터페이스가 여러 인터페이스를 상속받음
  * DIP (Dependency Inversion Principle, 의존관계 역전 원칙)
    * 상위 수준의 모듈은 하위 수준의 모듈에 의존해서는x
    * 추상화에 의존해야함 