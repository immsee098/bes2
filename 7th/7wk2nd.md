# 7주차 - 2강 Hibernate

### Hibernate
* 대표적인 jpa 구현체

* entityManager
  * [관련게시글](https://perfectacle.github.io/2018/01/14/jpa-entity-manager-factory/)
  * entitiyManager가 db로 바로 때리는 게 아닌 데이터를 관리하고 있음


* 트랜잭션
  * CRUD 시 R 외 transaction을 잡아서 처리해줘야함
 
* JPQL
  * createQuery를 사용할 수 있다. JPQL은 SQL과 다르게 관계(테이블)이 아니라 JPA 객체를 대상으로 하는 SQL과 유사한 쿼리(질의) 언어
  * DB에서 바로 가져오는 게 아닌 entity manager에 있는 영속된 객체를 가져옴