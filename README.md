# springboot-mybatis
使用mybatis中的@Mapper可对user表进行简单查询操作；
springframework.boot下的RELEASE应改成1.5.4，否则会报异常；
存在的问题：只能对表中存在的信息进行查询，若查询不到会报异常，可在UserMapper中进行增删改查操作，但只限于@语句，没有返回值。
