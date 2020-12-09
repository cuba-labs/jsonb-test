# Storing JSONB in PostgreSQL using CUBA

In order to use JSONB in CUBA, you’ll need to create custom data converters and specify them in persistence.xml. 
Also, you’ll need to change an entity’s column definition to store JSONB.

This example application stores a person in a DB table and their address as JSON.

Please note that you won’t be able to search entities that are stored in JSON format, but you should be able to edit data.

Key moments:

1. `com.company.jsonb.entity.JsonConverter` class that converts JSON to Address entity.
2. Person's attribute definition:
```java
@Convert(converter = JsonConverter.class)
@Column(name = "ADDRESS", columnDefinition = "jsonb")
private Address address;
```
3. View definition in both browser and editor screens. Please note fetch type:
```xml
<view extends="_local">
    <property name="address" fetch="UNDEFINED" view="_minimal"/>
</view>
```
4. Persistence unit definition:
```xml
<persistence-unit name="jsonb-test" transaction-type="RESOURCE_LOCAL">
     <class>com.company.jsonb.entity.JsonConverter</class>
     <class>com.company.jsonb.entity.Person</class>
</persistence-unit>
```
5. PostgreSQL’s driver should be specified as a dependency in global module:
```
dependencies {
    if (!JavaVersion.current().isJava8()) {
        runtime('javax.xml.bind:jaxb-api:2.3.1')
        runtime('org.glassfish.jaxb:jaxb-runtime:2.3.1')
    }
    compile(postgres);
}
