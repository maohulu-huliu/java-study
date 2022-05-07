### 7.没有getter/setter也能赋值

对于没有getter/setter的属性也能实现赋值操作`@Mapping(source = “customerName”, target = “name”)`不是用来指定属性映射的，如果两个对象的属性名相同是可以省略@Mapping的。