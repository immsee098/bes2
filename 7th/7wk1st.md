# 7주차 - 1강 ORM

### ORM
* Object Relational Mapping
  * 객체를 생성하거나 생명주기를 관리한다던가
  * 변화를 감지하는 기능 등
* SQL문을 직접생성x 자동으로o
  * 따라서 다른 db를 써도 알아서 처리해줌
  * 다양한 dbms 대응하기 좋음

### JPA(Jakarta Persistence API)
* 자카르타 영속화 api
  * 영속화란?: 잠시 내려놔도 쭉 이어지는 기슬들
* Jakarta EE
  * Jakarta = Java ~> 오픈소스 일때는 자카르타 사용
  * java의 orm 표준 
* Entity
  * DB에 저장된 자료를 표현