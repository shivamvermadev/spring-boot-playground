package com.graphql;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.graphql.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.CollectionUtils;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

@SpringBootApplication
public class GraphQlApplication implements CommandLineRunner {

    @Autowired
    private ObjectMapper objectMapper;

    public static void main(String[] args) {

        Person person1 = new Person("shivam", 23, "sre");
        Person person2 = new Person("Sarvesh", 22, "MP");
        Person person3 = new Person("Rafeeq", 23, "");
        Person person4 = new Person("Shivam", 23, "");


//        functionF(Arrays.asList(person1, person2, person3, person4));


//        SpringApplication.run(GraphQlApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        /**
         Map<String, List<Integer>> map = new HashMap<>();
         map.put("abc", Arrays.asList(1, 2, 3));
         map.put("efg", Arrays.asList(4, 5, 6));

         //		Gson gson = new Gson(map);
         ObjectMapper objectMapper = new ObjectMapper();
         String string = objectMapper.writeValueAsString(map);
         System.out.println(string);
         */

/*		Person person1 = new Person("a", 1);
		Person person2 = new Person("b", 2);
		Person person3 = new Person("c", 3);
		Person person4 = new Person("a", 5);
		List<Person> persons = Arrays.asList(person1, person2, person3, person4);

		functionF(persons);

		Map<String, List<Person>> collect = persons.stream()
				.collect(Collectors.toMap(person -> person.getName(), person -> Collections.singletonList(person), (oldVal, newVal) -> oldVal));
		Map<String, List<Person>> collect1 = persons.stream()
				.collect(Collectors.toMap(person -> person.getName(), person -> Collections.singletonList(person), (oldVal, newVal) -> newVal));

		Map<String, List<Person>> collect2 = persons.stream()
				.collect(Collectors.groupingBy(person -> person.getName()));

		System.out.println(collect);
		System.out.println(collect1);
		System.out.println(collect2);*/

//		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8, 9, 10);
//		List<CompletableFuture<Post>> completableFutures = list.stream().map(this::executeRule).collect(Collectors.toList());
//		CompletableFuture.allOf(completableFutures.toArray(new CompletableFuture[0])).join();
//		List<Post> posts = new ArrayList<>();
//
//		completableFutures.forEach(completableFuture-> {
//			try {
//				posts.add(completableFuture.get());
//			} catch (Exception e) {
//				System.out.println("failed ");
//			}
//		});
//
//		posts.stream().forEach(System.out::println);
//
//
////		CompletableFuture<Post> completableFuture = executeRule(1);
////		if(completableFuture.isDone()) {
////			Post post = completableFuture.get();
////			System.out.println(post.toString());
////		}
//	}
//
//	CompletableFuture<Post> executeRule(int id) {
//
//		return CompletableFuture.supplyAsync(()-> {
//			try {
//				URL url = new URL("https://jsonplaceholder.typicode.com/posts/" + id);
//				HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//				connection.setRequestProperty("accept", "application/json");
//				connection.setRequestMethod("GET");
//				InputStream responseStream = connection.getInputStream();
//				ObjectMapper mapper = new ObjectMapper();
//				Post post = mapper.readValue(responseStream, Post.class);
//				System.out.println(post);
//				return post;
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//			return null;
//		});
//		ABC.REINVEST.getVal();
//		ABC.TRANFER_FUND.getVal();
//		GraphQlRequest graphQlRequest = GraphQlRequest.builder().query("{getData{name age}}").build();
//		System.out.println(graphQlRequest.toString());
//		String s = objectMapper.writeValueAsString(graphQlRequest);
//		List<String> list = Arrays.asList("a", "b", "c", "d", "e");
//		String pqrs = list.stream().reduce((x, y) -> String.join(",", x, y)).orElse("pqrs");
//		System.out.println(pqrs);
//
//		System.out.println(s);

/*		String jsonString = "{\n" +
				"    \"name\": \"shivam\",\n" +
				"    \"age\": 23,\n" +
				"    \"company\": \"hashedin\",\n" +
				"    \"location\": {\n" +
				"        \"state\": \"UP\",\n" +
				"        \"city\": \"Saharanpur\"\n" +
				"    }\n" +
				"}";
		ObjectMapper objectMapper = new ObjectMapper();
		Employee employee = objectMapper.readValue(jsonString, Employee.class);
		System.out.println(employee.toString());*/

/*		Person person2 = new Person("b", 2);
		Person person1 = new Person("a", 1);
		Person person3 = new Person("c", 3);
		Person person4 = new Person("ab", 5);
		List<Person> persons = Arrays.asList(person1, person2, person3, person4);
//		String names = persons.stream().map(person -> person.getName()).collect(Collectors.joining(","));
//		System.out.println(names);
		String collect = persons.stream().map(Person::getName).collect(Collectors.toSet()).stream().collect(Collectors.joining(","));
		String join = String.join(",", persons.stream().map(Person::getName).collect(Collectors.toSet()));
		System.out.println(collect);
		System.out.println(join);

		Map<String, Integer> collect1 = persons.stream().collect(Collectors.toMap(Person::getName, Person::getAge));
		System.out.println(collect1);*/

//		System.out.println(Books.ABC.getCode());
//
//		Supplier<Boolean> supplier = () ->  true;
//		System.out.println(supplier.get());

//		Map<String, String> map = new HashMap<>();
//		String abc = map.get("abc");
//		System.out.println(abc);
//		if StringUtils.isEmpty()

//		Books bookByCode = Books.getBookByCode("123");
//		System.out.println(bookByCode);

        Map<String, List<String>> map = new HashMap<>();
        map.put("xyz", new ArrayList<>());

        if (map.containsKey("abc") || !CollectionUtils.isEmpty(map.get("abc"))) {
            System.out.println("hello world");
        }

        functionF(null);

        Person person1 = new Person("Shivam", 23, "sre");
        Person person2 = new Person("Sarvesh", 22, "MP");
        Person person3 = new Person("Rafeeq", 23, "");
        Person person4 = new Person("Shivam", 23, "");


        functionF(Arrays.asList(person1, person2, person3, person4));

        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(()->null);
        String s = completableFuture.get();
        System.out.println("----" + s);
        List<Integer> list = Arrays.asList(1,2,3,4,5);
//        list.toArray()(new int[0]).
        Integer[] objects = list.toArray(new Integer[1]);
        System.out.println("xxxxxxxxxxxx" + objects[0]);


        Map<Integer, String> map1 = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>();

        map1.put(1, "A");
        map1.put(2, "b");
        map1.put(3, "c");
        map1.put(4, "d");

        map2.put(11, "Ab");
        map2.put(2, "b");
        map2.put(3, "c");
        map2.put(41, "dd");

        List<Integer> collect = map1.keySet().stream().filter(map2::containsKey).collect(Collectors.toList());
        System.out.println("Collect : " + collect);


    }

    private static void functionF(List<Person> persons) {
        if(CollectionUtils.isEmpty(persons)) {
            return;
        }
        Map<Integer, List<Person>> collect = persons.stream().collect(groupingBy(Person::getAge));
        System.out.println(collect);
    }
}
