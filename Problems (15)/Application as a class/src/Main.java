class Application {
    String name;
    void run(String[] args) {
        // implement me
        int argsSize = args.length;
        System.out.println(name);
        for (int i = 0; i < argsSize; i++) {
            System.out.println(args[i]);
        }
    }
}