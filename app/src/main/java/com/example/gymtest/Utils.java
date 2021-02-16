package com.example.gymtest;

import java.util.ArrayList;

public class Utils {
    private static ArrayList<Training> trainings;
    private static ArrayList<Plan> plans;

    public static void initTrainings(){
        if(null == trainings){
            trainings = new ArrayList<>();
        }

        Training pushUp = new Training(1, "Liegestütze", "Liegestützen sind eien sportliche Eigengewichtübung zur Kräftigung der Muskeln.",
                "Liegestützen sind eien sportliche Eigengewichtübung zur Kräftigung der Muskeln. Hierbei speziell Schulter-, Arm- und Brustmuskulatur. Der gestreckte Körper wird dabei von den Armen gestützt, der Blick ist zu Boden hin gerichtet.",
                "https://assets.gqindia.com/photos/5cee7eb00379a73d25177759/master/pass/Pushup.jpg");
        trainings.add(pushUp);

        Training squat = new Training(2, "Squats", "Ein Squat ist eine Übung mit dem eigenen Körpergewicht, mit dem du vor allem deinen Unterkörper trainierst.",
                "Ein Squat ist eine Übung mit dem eigenen Körpergewicht, mit dem du vor allem deinen Unterkörper trainierst. Du kannst dabei mit dem eigenen Körpergewicht arbeiten, also ohne zusätzlichen Widerstand (Bodyweight Squat oder Air Squat genannt), oder mit Gewichten wie Hanteln.",
                "https://media1.popsugar-assets.com/files/thumbor/gjJt0kpxglD2UG_QZXoNDrNpl6A/fit-in/2048xorig/filters:format_auto-!!-:strip_icc-!!-/2020/05/07/844/n/1922729/tmp_M4k29K_aac9fae8e4fe86be_Mastering-Basic-Squat.jpg");
        trainings.add(squat);

        Training legPress = new Training(3, "Beinpresse",
                "In der Beinpresse werden besonders der vierköpfige Oberschenkelmuskel und der große Gesäßmuskel trainiert.",
                "In der Beinpresse werden besonders der vierköpfige Oberschenkelmuskel und der große Gesäßmuskel trainiert. Dein Unterkörper wird hier also in vollem Umfang aktiviert und die dazugehörigen Muskeln gestärkt, wodurch dein ganzer Körper an Stabilität gewinnen kann.",
                "https://images-na.ssl-images-amazon.com/images/I/71QjB5MjtBL._AC_SX425_.jpg");
        trainings.add(legPress);

        Training shoulderPress = new Training(4, "Arnold Presse",
                "Die Schulterübung Arnold-Presse beansprucht die Schultermuskulatur (insbesondere dessen vorderen Teil)",
                "Die Schulterübung Arnold-Presse beansprucht die Schultermuskulatur (insbesondere dessen vorderen Teil). Im Gegensatz zu herkömmlichen Schulterdückübungen wird die Schulter bei der Arnold-Presse durch zusätzliche statitische Muskelbelastungen (beim Eindrehen) beansprucht.",
                "https://www.meinefitness.net/wp-content/uploads/Arnold-Press_02.jpg");
        trainings.add(shoulderPress);

        Training pullUps = new Training(5, "Klimmzug",
                "Der Klimmzug ist eine Eigengewichtübung.",
                "Der Klimmzug ist eine Eigengewichtübung bei der der Körper durch den Rücken in Zusammenarbeit mit den Armen an einer waagerechten Stange (Klimmzugstange) hochgezogen und wieder herabgelassen wird.",
                "https://www.tunturi.org/website/Accessoires/14TUSCL366_1.jpg");
        trainings.add(pullUps);
    }

    public static ArrayList<Training> getTrainings() {
        return trainings;
    }

    public static boolean addPlan(Plan plan){
        if(null == plans){
            plans = new ArrayList<>();
        }

        return plans.add(plan);
    }

    public static ArrayList<Plan> getPlans() {
        return plans;
    }

    public static boolean removePlan(Plan plan){
        return plans.remove(plan);
    }
}
