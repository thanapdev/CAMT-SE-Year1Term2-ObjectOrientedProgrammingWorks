package lab6_2;

    public class TV {
        private int channel;
        private int volume;
        private boolean flag;
    
        public TV(int chn, int vol){
            channel = chn;
            volume = vol;
            flag = true;
        }
    
        public void turnTV(){
            if(this.flag){
                this.flag = false;
            } else {
                this.flag = true;
            }
        }
    
        public void changeChannel(int chn){
            if(chn > 99){
                channel = 99;
            } else if(chn < 0){
                channel = 0;
            } else {
                channel = chn;
            }
        }
    
        public void lowerVol(){
            if(volume > 0){
                volume--;
            } else {
                volume = 0;
            }
        }
    
        public void raiseVol(){
            if(volume < 20){
                volume++;
            } else {
                volume = 20;
            }
        }
    
        public int viewVol(){
            return volume;
        }
    
        public int viewChannel(){
            return channel;
        }
    
        public void checkTVFlag(){
            if(this.flag){
                System.out.println("This TV is on.");
            } else {
                System.out.println("This TV is off.");
            }
        }
  }
