package com.dallinfromearth.gopherchef;

import java.util.ArrayList;

public class Recipe {
    private String name;
    private String description;
    private String contributor;
    //TODO: add private set<ReadOnlyTag> GenericTags
    private ArrayList<String> ingredients;
    private String instructions;

    Recipe() {
        this("Unnamed", null, null, null, null);
    }
    Recipe(String name_, String description_, String contributor_, String instructions_,  ArrayList<String> ingredients_) {
        name = name_;
        description = description_;
        contributor = contributor_;
        instructions = instructions_;
        if (ingredients_ == null) { ingredients_ = new ArrayList<String>(); }
        ingredients = ingredients_;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Recipe:\n" + name);
        if (contributor != null) { builder.append("\n Contributed by: " + contributor); }
        if (description != null) { builder.append("\n " + description); }
        if (ingredients.size() > 0) {
            builder.append("\n Ingredients:");
            for (String item : ingredients) {
                builder.append("\n   -" + item);
            }
        }
        if (instructions != null) { builder.append("\n " + instructions); }
        return builder.toString();
    }

    //TODO: add functions for adding/removing tags

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContributor() {
        return contributor;
    }

    public void setContributor(String contributor) {
        this.contributor = contributor;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    public void addIngredient(String newIngredient) {
        ingredients.add(newIngredient);
    }

    public void removeIngredient(int index) {
        ingredients.remove(index);
    }
}
