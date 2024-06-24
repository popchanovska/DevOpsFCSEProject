package mk.ukim.finki.wp.kol2022.g1.repository;

import mk.ukim.finki.wp.kol2022.g1.model.Employee;
import mk.ukim.finki.wp.kol2022.g1.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findAllBySkillsContains(Skill skill);
    List<Employee> findAllByEmploymentDateBefore(LocalDate min_date);
    List<Employee> findAllBySkillsContainsAndEmploymentDateBefore(Skill skill, LocalDate date);
    Optional<Employee> findByEmail(String email);
}
