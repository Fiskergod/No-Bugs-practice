package homework_12.task_1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class EntityManagerTest {
    /**
     * TEST CASES:
     * happy path:
        add, remove, фильтрация
     * negative path:
        remove(несуществующий объект), null
     * edge path:
        minAge > maxAge
     */

    EntityManager<Person> personManager;
    private Person person1, person2, person3;

    @BeforeEach
    public void setUp() {
        personManager = new EntityManager<>();
        person1 = new Person("Иван", 25, true);
        person2 = new Person("Петр", 18, false);
        person3 = new Person("Анна", 44, true);
    }

    // happy path:
    @Test
    public void addEntityTest() {
        personManager.add(person1);
        assertEquals(1, personManager.getAll().size());
    }

    @Test
    public void removeEntityTest() {
        personManager.add(person1);
        assertTrue(personManager.remove(person1));
        assertEquals(0, personManager.getAll().size());
        assertFalse(personManager.getAll().contains(person1));
    }

    @Test
    public void filterByAgeTest() {
        personManager.add(person1);
        personManager.add(person2);
        personManager.add(person3);
        List<Person> personTestList = personManager.filterByAge(18, 30);
        assertEquals(2, personTestList.size());
    }

    @Test
    public void testFilterByName() {
        personManager.add(person1);
        personManager.add(person2);
        personManager.add(person3);
        List<Person> result = personManager.filterByName("Иван");
        assertEquals(1, result.size());
        assertTrue(result.contains(person1));
    }

    @Test
    public void testFilterByActive() {
        personManager.add(person1);
        personManager.add(person2);
        personManager.add(person3);
        List<Person> activeUsers = personManager.filterByActive(true);
        assertEquals(2, activeUsers.size());
    }

    // negative path:
    @Test
    public void removeNotFoundEntityTest() {
        personManager.add(person1);
        personManager.add(person2);
        Person unknown = new Person("Алеша", 80, false);
        assertFalse(personManager.remove(unknown));
        assertEquals(2, personManager.getAll().size());
    }

    @Test
    public void nullPointerExceptionTest() {
        personManager.add(null);
        assertThrows(NullPointerException.class, () -> {
            personManager.getAll().size();
        });
    }

    @Test
    public void testRemoveNullElement() {
        personManager.add(null);
        boolean removed = personManager.remove(null);
        assertTrue(removed);
        assertTrue(personManager.getAll().isEmpty());
    }

    // edge path:
    @Test
    public void testMinMaxAge() {
        personManager.add(person1);
        personManager.add(person2);
        personManager.add(person3);
        // min = max
        assertEquals(1, personManager.filterByAge(25, 25).size());
        // min > max
        assertEquals(0, personManager.filterByAge(30, 18).size());
        // широкий диапазон
        assertEquals(3, personManager.filterByAge(0, 100).size());
    }
}
