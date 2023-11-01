
    class bus extends koeretoej{
        protected int passagerer;
        protected int doere;

        public bus() {
        }



        public bus(int passagerer, int doere) {
            this.passagerer = passagerer;
            this.doere = doere;
        }
        public void udskriv() {
            super.udskriv();
            System.out.println(passagerer);
            System.out.println(doere);

        }

        public bus(double vaegtafgift, String registreringsnummer, int passagerer, int doere) {
            super(vaegtafgift, registreringsnummer);
            this.passagerer = passagerer;
            this.doere = doere;
        }

        public int getPassagerer() {
            return passagerer;
        }

        public void setPassagerer(int passagerer) {
            this.passagerer = passagerer;
        }

        public int getDoere() {
            return doere;
        }

        public void setDoere(int doere) {
            this.doere = doere;
        }
    }

