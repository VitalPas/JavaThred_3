package ord.example.homework.second.office;

public class Office {
    Boss boss;
    Manager manager;
    Secretary secretary;
    Security security;

    public Office(Boss boss, Manager manager, Secretary secretary, Security security) {
        this.boss = boss;
        this.manager = manager;
        this.secretary = secretary;
        this.security = security;
    }

    public void workDay() {
        boss.hurryManager(manager);
        manager.sayHelp();
        security.giveMyMoney();
        secretary.stopThisShit(boss, manager, security);
    }
}
