# Retention
1. RetentionPolicy.SOURCE 只作用在源代码
2. RetentionPolicy.CLASS 不仅仅作用在源代码，还会被编译器写入CLASS文件里
3. RetentionPolicy.RUNTIME 不仅仅作用在源代码，被写入CLASS文件，运行时还被保留，能通过反射获取
# Target

ElementType.{CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, MODULE, PARAMETER, TYPE}

# Documented

注解可以进入JavaDoc

# Inherited 

一个注解A里有@Inherited里，那么被A注解修饰的类B

类B也会自动继承该注解A