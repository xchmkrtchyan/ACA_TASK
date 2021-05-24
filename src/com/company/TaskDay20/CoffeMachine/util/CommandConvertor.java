package com.company.TaskDay20.CoffeMachine;

public class CommandConvertor {
    public static Command convert(String input) {
        Command command = new Command();
        String[] split = input.split(":");
        extractDrinkType(command, split);
        command.setSugarQuantity(Integer.parseInt(split[1]));
        return command;
    }

    private static void extractDrinkType(Command command, String[] split) {
        switch (split[0]) {
            case "T" -> command.setDrinkType(DrinkType.TEA);
            case "C" -> command.setDrinkType(DrinkType.COFFEE);
            case "S" -> command.setDrinkType(DrinkType.CHOCOLATE);
        }
    }
}
