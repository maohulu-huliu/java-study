### 6.更新对象属性

在之前的例子中`UserRoleDto useParameter(User user, String myRoleName);`都是通过类似上面的方法来生成一个对象。而MapStruct提供了另外一种方式来更新一个对象中的属性。@MappingTarget
通过@MappingTarget来指定目标类是谁（谁的属性需要被更新）。@Mapping还是用来定义属性对应规则。