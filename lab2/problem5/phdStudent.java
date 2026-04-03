package problem5;

public class phdStudent extends Student {

    private String researchTopic;

    public phdStudent(String name, int age, String major, String topic) {
        super(name, age, major);
        this.researchTopic = topic;
    }

    @Override
    public void assignPet(Animal pet) {

        if (pet instanceof Dog) {
            System.out.println("PhD students cannot take care of dogs.");
            return;
        }
        
        super.assignPet(pet);
    }

    @Override
    public String getOccupation() {
        return "PhD Student researching " + researchTopic;
    }
}

