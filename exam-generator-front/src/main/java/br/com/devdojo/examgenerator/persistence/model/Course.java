package br.com.devdojo.examgenerator.persistence.model;

/**
 * @author William Suane for DevDojo on 11/7/17.
 */
public class Course extends AbstractEntity {
//    @NotEmpty(message = "The field name cannot be empty")
    private String name;
    private Professor professor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public static final class Builder {
        private Course course;

        private Builder() {
            course = new Course();
        }

        public static Builder newCourse() {
            return new Builder();
        }

        public Builder id(Long id) {
            course.setId(id);
            return this;
        }

        public Builder name(String name) {
            course.setName(name);
            return this;
        }

        public Builder professor(Professor professor) {
            course.setProfessor(professor);
            return this;
        }

        public Course build() {
            return course;
        }
    }
}