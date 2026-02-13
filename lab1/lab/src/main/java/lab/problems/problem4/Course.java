

package lab.problems.problem4;

import java.util.List;

/**
 * Course
 */
public class Course {
    private String name;
    private String description;
    private int credits;
    private List<Course> prerequisites;
    public Course(
        String name,
        String description,
        int credits
    ){
        this.name = name;
        this.description = description;
        this.credits = credits;
    }
    public Course(
        String name,
        String description,
        int credits,
        List<Course> prerequisites
    ){
        this(name, description, credits);
        this.prerequisites = prerequisites;
    }
    
    public String getName() {
        return this.name;
    }
    public String getDescription(){
        return this.description;
    }
    public int getCredits() {
        return this.credits;
    }
    public List<Course> getPrerequisites() {
        return this.prerequisites;
    }
    @Override
    public String toString() {
        StringBuilder representation = new StringBuilder(); 
        representation.append(
            String.format(
            "Name: %s\n" +
            "Description: %s\n" +
            "Number of credits: %d\n",
            name,
            description,
            credits
            )
        );
        if(prerequisites == null || prerequisites.size() == 0)
            return representation.toString();
        representation.append("Prerequisites:\n");
        for(Course course : prerequisites) {
            representation.append(course.name);
        }
        return representation.toString();
    }
}
