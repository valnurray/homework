package com.lankin.Iterator;

public class Dev implements Collection {
    private String name;
    private String[] skills;

    public Dev(String name, String[] skills) {
        this.name = name;
        this.skills = skills;
    }


    @Override
    public Iterator<E> getIterator() {
        return new SkillsIterator();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    private class SkillsIterator implements Iterator<E> {
        int index;

        @Override
        public boolean hasNext() {
            if(index < skills.length){
                return true;
            }
                return false;

        }

        @Override
        public Object next() {
            return skills[index++];
        }
    }
}

