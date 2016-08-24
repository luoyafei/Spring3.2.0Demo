# 使用Spring3.2.0+Hibernate3.2.2+Struts2 2.2.3整合小demo以及配置使用的jar包集合
所有需要的jar都在WEB-INF下的lib内。
首先将spring3.2下lib内的所有包全引入，
其次需要commons-logging-1.1.1.jar，否则项目无法跑起来。注意：所有的spring都需要这个包。
使用aop的话就必须引入：
aopalliance-1.0.jar
aspectjrt.jar
aspectjweaver.jar
如果使用dbcp连接池必须引入：commons-dbcp.jar和commons-pool.jar
最终要的一点就是：必要要引入struts2-spring-plugin-2.2.3.jar！这样才能在struts2中的action类与spring结合在一起。
还有其他的配置文件，可以自己在项目中看。
至于struts2和hibernate的jar包引入就不特别说明了。

祝大家一样成功！
