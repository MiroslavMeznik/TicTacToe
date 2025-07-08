import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("3x3 Tic Tac Toe");

//        //vytvorit pole pomocne vypocty a testy
//        String[][] twoDStringArray = new String[3][3];
//        for(String[] rowOfStrings : twoDStringArray) {
//            for(String s : rowOfStrings) {
//                System.out.println(s);
//            }
//        }
            int[][] emptyMatrix = new int[3][3];
            emptyMatrix[0][0] = 1;
            emptyMatrix[1][1] = 5;
            emptyMatrix[2][2] = 9;

            System.out.println("Základná matica 3x3:");
            print2DArray(emptyMatrix);

    }

        public static void print2DArray(int[][] array) {
            for (int row = 0; row < array.length; row++) {
                for (int col = 0; col < array[row].length; col++) {
                    System.out.printf("%4d", array[row][col]);
                }
                System.out.println();
            }
        }

//    import java.util.Arrays;
//import java.util.InputMismatchException;
//import java.util.Random;
//import java.util.Scanner;
//
//    public class ArraysExceptionsWebinar {
//        public static void main(String[] args) {
//            System.out.println("=== WEBINÁR: POLIA, 2D POLIA A VÝNIMKY ===");
//
//            Scanner scanner = new Scanner(System.in);
//
//            // ============================================
//            // 1. ZÁKLADY POLÍ - ÚVOD
//            // ============================================
//
//            System.out.println("\n=== 1. ZÁKLADY POLÍ ===");
//
//            // Deklarácia a inicializácia jednorozmerného poľa
//            int[] numbers = {1, 2, 3, 4, 5};
//            String[] names = {"Anna", "Peter", "Mária"};
//
//            // Alternatívny spôsob vytvorenia poľa
//            int[] emptyArray = new int[5];  // Všetky prvky sú 0
//            emptyArray[0] = 10;
//            emptyArray[1] = 20;
//            emptyArray[2] = 30;
//
//            // Základné operácie s poľami
//            System.out.println("Pole čísel: " + Arrays.toString(numbers));
//            System.out.println("Prvý prvok: " + numbers[0]);
//            System.out.println("Posledný prvok: " + numbers[numbers.length - 1]);
//            System.out.println("Dĺžka poľa: " + numbers.length);
//
//            // Prechádzanie poľa klasickým for cyklom
//            System.out.println("Výpis klasickým for cyklom:");
//            for (int i = 0; i < numbers.length; i++) {
//                System.out.println("Index " + i + ": " + numbers[i]);
//            }
//
//            // Prechádzanie poľa enhanced for cyklom (for-each)
//            System.out.println("Výpis for-each cyklom:");
//            for (int number : numbers) {
//                System.out.println("Hodnota: " + number);
//            }
//
//            // ============================================
//            // 2. PRAKTICKÉ ÚLOHY S JEDNOROZMERNÝMI POĽAMI
//            // ============================================
//
//            System.out.println("\n=== 2. PRAKTICKÉ ÚLOHY S POĽAMI ===");
//
//            // ÚLOHA 1: Súčet prvkov poľa
//            int sum = calculateSum(numbers);
//            System.out.println("Súčet prvkov: " + sum);
//
//            // ÚLOHA 2: Najväčší prvok
//            int max = findMaximum(numbers);
//            System.out.println("Najväčší prvok: " + max);
//
//            // ÚLOHA 3: Počet párnych čísel
//            int evenCount = countEvenNumbers(numbers);
//            System.out.println("Počet párnych čísel: " + evenCount);
//
//            // ÚLOHA 4: Vytvorenie poľa náhodných čísel
//            int[] randomNumbers = generateRandomArray(10);
//            System.out.println("Náhodné čísla: " + Arrays.toString(randomNumbers));
//
//            // ============================================
//            // 3. DVOJROZMERNÉ POLIA - ÚVOD
//            // ============================================
//
//            System.out.println("\n=== 4. DVOJROZMERNÉ POLIA ===");
//
//            // Vytvorenie a inicializácia 2D poľa
//            int[][] matrix = {
//                    {1, 2, 3},
//                    {4, 5, 6},
//                    {7, 8, 9}
//            };
//
//            // Alternatívny spôsob vytvorenia
//            int[][] emptyMatrix = new int[3][3];
//            emptyMatrix[0][0] = 1;
//            emptyMatrix[1][1] = 5;
//            emptyMatrix[2][2] = 9;
//
//            System.out.println("Základná matica 3x3:");
//            print2DArray(matrix);
//
//            // Prístup k prvkom
//            System.out.println("Prvok na pozícii [1][2]: " + matrix[1][2]);
//            System.out.println("Počet riadkov: " + matrix.length);
//            System.out.println("Počet stĺpcov v prvom riadku: " + matrix[0].length);
//
//            // ============================================
//            // 4. ALGORITMY S 2D POĽAMI
//            // ============================================
//
//            System.out.println("\n=== 5. ALGORITMY S 2D POĽAMI ===");
//
//            // Súčet všetkých prvkov
//            int matrixSum = sum2DArray(matrix);
//            System.out.println("Súčet všetkých prvkov: " + matrixSum);
//
//            // Súčty riadkov
//            System.out.println("Súčty riadkov:");
//            for (int i = 0; i < matrix.length; i++) {
//                int rowSum = sumRow(matrix, i);
//                System.out.println("Riadok " + i + ": " + rowSum);
//            }
//
//            // Súčty stĺpcov
//            System.out.println("Súčty stĺpcov:");
//            for (int j = 0; j < matrix[0].length; j++) {
//                int colSum = sumColumn(matrix, j);
//                System.out.println("Stĺpec " + j + ": " + colSum);
//            }
//
//            // Hlavná diagonála
//            int mainDiagonal = sumMainDiagonal(matrix);
//            System.out.println("Súčet hlavnej diagonály: " + mainDiagonal);
//
//            // ============================================
//            // 5. VÝNIMKY - ÚVOD A ZÁKLADY
//            // ============================================
//
//            System.out.println("\n=== 5. VÝNIMKY - ZÁKLADY ===");
//
//            // Príklad základného try-catch bloku
//            demonstrateBasicExceptions();
//
//            // Rôzne typy výnimiek
//            demonstrateExceptionTypes();
//
//            // ============================================
//            // 6. VÝNIMKY SO SCANNEROM
//            // ============================================
//
//            System.out.println("\n=== 6. VÝNIMKY SO SCANNEROM ===");
//
//            // Bezpečné načítanie čísla
//            int safeNumber = getSafeInteger(scanner, "Zadaj celé číslo: ");
//            System.out.println("Zadal si: " + safeNumber);
//
//            // Bezpečné načítanie čísla v rozsahu
//            int numberInRange = getIntegerInRange(scanner, "Zadaj číslo od 1 do 10: ", 1, 10);
//            System.out.println("Číslo v rozsahu: " + numberInRange);
//
//            // ============================================
//            // 7. PRAKTICKÉ ÚLOHY KOMBINUJÚCE VŠETKO
//            // ============================================
//
//            System.out.println("\n=== 7. KOMPLEXNÉ ÚLOHY ===");
//
//            // ÚLOHA 1: Kalkulačka s poľami a výnimkami
//            System.out.print("Chceš použiť kalkulačku? (ano/nie): ");
//            String response = scanner.nextLine();
//            if (response.equalsIgnoreCase("ano")) {
//                runArrayCalculator(scanner);
//            }
//
//            // ÚLOHA 2: Tabuľka násobenia
//            System.out.print("Chceš vytvoriť tabuľku násobenia? (ano/nie): ");
//            response = scanner.nextLine();
//            if (response.equalsIgnoreCase("ano")) {
//                createMultiplicationTable(scanner);
//            }
//
//            // ÚLOHA 3: Jednoduchá hra - hľadanie pokladu v 2D poli
//            System.out.print("Chceš hrať hru hľadania pokladu? (ano/nie): ");
//            response = scanner.nextLine();
//            if (response.equalsIgnoreCase("ano")) {
//                playTreasureHunt(scanner);
//            }
//
//            // ============================================
//            // 8. POKROČILÉ ÚLOHY
//            // ============================================
//
//            System.out.println("\n=== 8. POKROČILÉ ÚLOHY ===");
//
//            // Matica s náhodnými číslami a analýza
//            System.out.print("Chceš analyzovať náhodnú maticu? (ano/nie): ");
//            response = scanner.nextLine();
//            if (response.equalsIgnoreCase("ano")) {
//                analyzeRandomMatrix(scanner);
//            }
//
//            scanner.close();
//            System.out.println("\nWebinár skončil. Ďakujeme za pozornosť!");
//
//            // ============================================
//            // INTERAKTÍVNA ÚLOHA S POĽAMI
//            // ============================================
//
//            System.out.println("\n=== 3. INTERAKTÍVNE ÚLOHY ===");
//
//            // ÚLOHA: Študenti a ich známky
//            System.out.print("Koľko študentov chceš zadať? ");
//            try {
//                int studentCount = scanner.nextInt();
//                scanner.nextLine(); // Vyčistenie bufferu
//
//                if (studentCount <= 0) {
//                    System.out.println("Počet študentov musí byť kladné číslo!");
//                } else {
//                    runStudentGrades(scanner, studentCount);
//                }
//            } catch (InputMismatchException e) {
//                System.out.println("Chyba: Musíš zadať celé číslo!");
//                scanner.nextLine(); // Vyčistenie bufferu
//            }
//        }
//
//        // ============================================
//        // METÓDY PRE PRÁCU S 1D POĽAMI
//        // ============================================
//
//        public static int calculateSum(int[] array) {
//            int sum = 0;
//            for (int number : array) {
//                sum += number;
//            }
//            return sum;
//        }
//
//        public static int findMaximum(int[] array) {
//            int max = array[0];
//            for (int number : array) {
//                if (number > max) {
//                    max = number;
//                }
//            }
//            return max;
//        }
//
//        public static int countEvenNumbers(int[] array) {
//            int count = 0;
//            for (int number : array) {
//                if (number % 2 == 0) {
//                    count++;
//                }
//            }
//            return count;
//        }
//
//        public static int[] generateRandomArray(int size) {
//            Random random = new Random();
//            int[] array = new int[size];
//            for (int i = 0; i < size; i++) {
//                array[i] = random.nextInt(100) + 1; // 1-100
//            }
//            return array;
//        }
//
//        // ============================================
//        // METÓDY PRE PRÁCU S 2D POĽAMI
//        // ============================================
//
//        public static void print2DArray(int[][] array) {
//            for (int row = 0; row < array.length; row++) {
//                for (int col = 0; col < array[row].length; col++) {
//                    System.out.printf("%4d", array[row][col]);
//                }
//                System.out.println();
//            }
//        }
//
//        public static int sum2DArray(int[][] array) {
//            int sum = 0;
//            for (int[] row : array) {
//                for (int number : row) {
//                    sum += number;
//                }
//            }
//            return sum;
//        }
//
//        public static int sumRow(int[][] array, int rowIndex) {
//            int sum = 0;
//            for (int col = 0; col < array[rowIndex].length; col++) {
//                sum += array[rowIndex][col];
//            }
//            return sum;
//        }
//
//        public static int sumColumn(int[][] array, int colIndex) {
//            int sum = 0;
//            for (int row = 0; row < array.length; row++) {
//                sum += array[row][colIndex];
//            }
//            return sum;
//        }
//
//        public static int sumMainDiagonal(int[][] array) {
//            int sum = 0;
//            for (int i = 0; i < array.length; i++) {
//                sum += array[i][i];
//            }
//            return sum;
//        }
//
//        // ============================================
//        // METÓDY PRE VÝNIMKY
//        // ============================================
//
//        public static void demonstrateBasicExceptions() {
//            System.out.println("--- Demonštrácia základných výnimiek ---");
//
//            // ArithmeticException
//            try {
//                int result = 10 / 0;
//                System.out.println("Výsledok: " + result);
//            } catch (ArithmeticException e) {
//                System.out.println("Chyba: Delenie nulou! " + e.getMessage());
//            }
//
//            // ArrayIndexOutOfBoundsException
//            try {
//                int[] numbers = {1, 2, 3};
//                System.out.println("Prvok: " + numbers[5]);
//            } catch (ArrayIndexOutOfBoundsException e) {
//                System.out.println("Chyba: Index mimo rozsah poľa!");
//            }
//
//            // NullPointerException
//            try {
//                String text = null;
//                int length = text.length();
//            } catch (NullPointerException e) {
//                System.out.println("Chyba: Pokúšaš sa pracovať s null referenciou!");
//            }
//
//            System.out.println("Program pokračuje normálne po zachytení výnimiek.");
//        }
//
//        public static void demonstrateExceptionTypes() {
//            System.out.println("--- Typy výnimiek ---");
//            System.out.println("1. Checked exceptions - musia sa deklarovať alebo zachytiť");
//            System.out.println("   Príklady: IOException, FileNotFoundException");
//            System.out.println("2. Unchecked exceptions - nie je potrebné ich deklarovať");
//            System.out.println("   Príklady: RuntimeException, NullPointerException, ArithmeticException");
//            System.out.println("3. Errors - závažné chyby, ktoré aplikácia nemôže zvládnuť");
//            System.out.println("   Príklady: OutOfMemoryError, StackOverflowError");
//        }
//
//        public static int getSafeInteger(Scanner scanner, String prompt) {
//            while (true) {
//                try {
//                    System.out.print(prompt);
//                    return scanner.nextInt();
//                } catch (InputMismatchException e) {
//                    System.out.println("Chyba: Musíš zadať celé číslo!");
//                    scanner.nextLine(); // Vyčistenie bufferu
//                }
//            }
//        }
//
//        public static int getIntegerInRange(Scanner scanner, String prompt, int min, int max) {
//            while (true) {
//                try {
//                    System.out.print(prompt);
//                    int number = scanner.nextInt();
//                    if (number < min || number > max) {
//                        System.out.println("Číslo musí byť v rozsahu " + min + " až " + max + "!");
//                        continue;
//                    }
//                    return number;
//                } catch (InputMismatchException e) {
//                    System.out.println("Chyba: Musíš zadať celé číslo!");
//                    scanner.nextLine(); // Vyčistenie bufferu
//                }
//            }
//        }
//
//        // ============================================
//        // KOMPLEXNÉ METÓDY
//        // ============================================
//
//        public static void runStudentGrades(Scanner scanner, int studentCount) {
//            String[] students = new String[studentCount];
//            double[] grades = new double[studentCount];
//
//            System.out.println("--- Zadávanie údajov o študentoch ---");
//
//            for (int i = 0; i < studentCount; i++) {
//                System.out.print("Meno " + (i + 1) + ". študenta: ");
//                students[i] = scanner.nextLine();
//
//                while (true) {
//                    try {
//                        System.out.print("Známka pre " + students[i] + " (1-5): ");
//                        double grade = scanner.nextDouble();
//                        scanner.nextLine(); // Vyčistenie bufferu
//
//                        if (grade < 1 || grade > 5) {
//                            System.out.println("Známka musí byť v rozsahu 1-5!");
//                            continue;
//                        }
//
//                        grades[i] = grade;
//                        break;
//                    } catch (InputMismatchException e) {
//                        System.out.println("Chyba: Zadaj číselnú známku!");
//                        scanner.nextLine(); // Vyčistenie bufferu
//                    }
//                }
//            }
//
//            // Analýza výsledkov
//            System.out.println("\n--- VÝSLEDKY ---");
//            double sum = 0;
//            double bestGrade = grades[0];
//            String bestStudent = students[0];
//
//            for (int i = 0; i < students.length; i++) {
//                System.out.println(students[i] + ": " + grades[i]);
//                sum += grades[i];
//
//                if (grades[i] < bestGrade) { // Lepšia známka = menšie číslo
//                    bestGrade = grades[i];
//                    bestStudent = students[i];
//                }
//            }
//
//            double average = sum / studentCount;
//            System.out.println("Priemer triedy: " + String.format("%.2f", average));
//            System.out.println("Najlepší študent: " + bestStudent + " (" + bestGrade + ")");
//        }
//
//        public static void runArrayCalculator(Scanner scanner) {
//            System.out.println("--- Kalkulačka s poľami ---");
//
//            int size = getIntegerInRange(scanner, "Koľko čísel chceš zadať? ", 1, 10);
//            double[] numbers = new double[size];
//
//            // Načítanie čísel
//            for (int i = 0; i < size; i++) {
//                while (true) {
//                    try {
//                        System.out.print("Zadaj " + (i + 1) + ". číslo: ");
//                        numbers[i] = scanner.nextDouble();
//                        break;
//                    } catch (InputMismatchException e) {
//                        System.out.println("Chyba: Zadaj platné číslo!");
//                        scanner.nextLine();
//                    }
//                }
//            }
//
//            // Výpočty
//            double sum = 0, max = numbers[0], min = numbers[0];
//
//            for (double number : numbers) {
//                sum += number;
//                if (number > max) max = number;
//                if (number < min) min = number;
//            }
//
//            System.out.println("\n--- VÝSLEDKY KALKULAČKY ---");
//            System.out.println("Zadané čísla: " + Arrays.toString(numbers));
//            System.out.println("Súčet: " + sum);
//            System.out.println("Priemer: " + (sum / size));
//            System.out.println("Najväčšie: " + max);
//            System.out.println("Najmenšie: " + min);
//        }
//
//        public static void createMultiplicationTable(Scanner scanner) {
//            System.out.println("--- Tabuľka násobenia ---");
//
//            int size = getIntegerInRange(scanner, "Zadaj veľkosť tabuľky (1-12): ", 1, 12);
//
//            int[][] table = new int[size][size];
//
//            // Vytvorenie tabuľky
//            for (int row = 0; row < size; row++) {
//                for (int col = 0; col < size; col++) {
//                    table[row][col] = (row + 1) * (col + 1);
//                }
//            }
//
//            // Výpis tabuľky
//            System.out.println("Tabuľka násobenia " + size + "x" + size + ":");
//
//            // Hlavička
//            System.out.print("    ");
//            for (int i = 1; i <= size; i++) {
//                System.out.printf("%4d", i);
//            }
//            System.out.println();
//
//            // Riadky
//            for (int row = 0; row < size; row++) {
//                System.out.printf("%4d", row + 1);
//                for (int col = 0; col < size; col++) {
//                    System.out.printf("%4d", table[row][col]);
//                }
//                System.out.println();
//            }
//        }
//
//        public static void playTreasureHunt(Scanner scanner) {
//            System.out.println("--- Hra hľadania pokladu ---");
//            System.out.println("Nájdi poklad v 5x5 mape! Máš 10 pokusov.");
//
//            Random random = new Random();
//            int treasureRow = random.nextInt(5);
//            int treasureCol = random.nextInt(5);
//
//            boolean[][] revealed = new boolean[5][5];
//            int attempts = 0;
//            int maxAttempts = 10;
//            boolean found = false;
//
//            while (attempts < maxAttempts && !found) {
//                // Výpis mapy
//                System.out.println("\nMapa (X = preskúmané, ? = nepreskúmané):");
//                System.out.print("  ");
//                for (int i = 0; i < 5; i++) {
//                    System.out.print(" " + i);
//                }
//                System.out.println();
//
//                for (int row = 0; row < 5; row++) {
//                    System.out.print(row + " ");
//                    for (int col = 0; col < 5; col++) {
//                        if (revealed[row][col]) {
//                            System.out.print(" X");
//                        } else {
//                            System.out.print(" ?");
//                        }
//                    }
//                    System.out.println();
//                }
//
//                try {
//                    System.out.println("Pokusov zostáva: " + (maxAttempts - attempts));
//                    int row = getIntegerInRange(scanner, "Zadaj riadok (0-4): ", 0, 4);
//                    int col = getIntegerInRange(scanner, "Zadaj stĺpec (0-4): ", 0, 4);
//
//                    if (revealed[row][col]) {
//                        System.out.println("Toto miesto si už preskúmal!");
//                        continue;
//                    }
//
//                    revealed[row][col] = true;
//                    attempts++;
//
//                    if (row == treasureRow && col == treasureCol) {
//                        System.out.println("🎉 GRATULUJEM! Našiel si poklad na pozícii [" + row + "][" + col + "]!");
//                        found = true;
//                    } else {
//                        int distance = Math.abs(row - treasureRow) + Math.abs(col - treasureCol);
//                        if (distance == 1) {
//                            System.out.println("🔥 HORÚCO! Poklad je veľmi blízko!");
//                        } else if (distance == 2) {
//                            System.out.println("😊 TEPLO! Poklad je blízko!");
//                        } else if (distance <= 4) {
//                            System.out.println("😐 CHLADNO! Poklad je ďaleko!");
//                        } else {
//                            System.out.println("🥶 ZIMA! Poklad je veľmi ďaleko!");
//                        }
//                    }
//                } catch (Exception e) {
//                    System.out.println("Nastala neočakávaná chyba: " + e.getMessage());
//                }
//            }
//
//            if (!found) {
//                System.out.println("💔 Nevyšlo! Poklad bol na pozícii [" + treasureRow + "][" + treasureCol + "]");
//            }
//        }
//
//        public static void analyzeRandomMatrix(Scanner scanner) {
//            System.out.println("--- Analýza náhodnej matice ---");
//
//            int size = getIntegerInRange(scanner, "Zadaj veľkosť matice (3-8): ", 3, 8);
//
//            Random random = new Random();
//            int[][] matrix = new int[size][size];
//
//            // Naplnenie matice náhodnými číslami
//            for (int row = 0; row < size; row++) {
//                for (int col = 0; col < size; col++) {
//                    matrix[row][col] = random.nextInt(100) + 1; // 1-100
//                }
//            }
//
//            System.out.println("Vygenerovaná matica:");
//            print2DArray(matrix);
//
//            // Analýza
//            int sum = sum2DArray(matrix);
//            int max = matrix[0][0];
//            int min = matrix[0][0];
//            int evenCount = 0;
//
//            for (int row = 0; row < size; row++) {
//                for (int col = 0; col < size; col++) {
//                    int value = matrix[row][col];
//                    if (value > max) max = value;
//                    if (value < min) min = value;
//                    if (value % 2 == 0) evenCount++;
//                }
//            }
//
//            System.out.println("\n--- ANALÝZA ---");
//            System.out.println("Súčet všetkých prvkov: " + sum);
//            System.out.println("Priemer: " + String.format("%.2f", (double) sum / (size * size)));
//            System.out.println("Najväčší prvok: " + max);
//            System.out.println("Najmenší prvok: " + min);
//            System.out.println("Počet párnych čísel: " + evenCount);
//            System.out.println("Súčet hlavnej diagonály: " + sumMainDiagonal(matrix));
//
//            // Súčty riadkov
//            System.out.println("\nSúčty riadkov:");
//            for (int i = 0; i < size; i++) {
//                System.out.println("Riadok " + i + ": " + sumRow(matrix, i));
//            }
//
//            // Súčty stĺpcov
//            System.out.println("\nSúčty stĺpcov:");
//            for (int j = 0; j < size; j++) {
//                System.out.println("Stĺpec " + j + ": " + sumColumn(matrix, j));
//            }
//        }
//    }


}