String asal2,dest;
          double jarak = 0,harga = 0,total=0;
          int result ;
          JFrame frame = new JFrame(); 
          asal2 = (String) asal.getSelectedItem();
          dest = (String) destinasi.getSelectedItem();
        if(login.isSelected()){
            int i=0;
            do{
        JTextField userField = new JTextField();
        JPasswordField passField = new JPasswordField();
        String message = "Please enter your user name and password.";
        result = JOptionPane.showOptionDialog(frame, new Object[] {message, userField, passField},
                
        "Login", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (result == JOptionPane.OK_OPTION){
             String username,password;
        
        username="alif";
        password="12345";
        
        if (username.equalsIgnoreCase(userField.getText())&& password.equalsIgnoreCase(passField.getText()))
        {
            i=1;
            String[] driver = new String[]{
            "Pak Jarmo" ,"Pak Kimin" ,"Pak Owi","Pak Darto"
                ,"Pak Kanwo" ,"Pak Ambatu" , "Pak Lawu"
        };
                Random r = new Random();
        int id = r.nextInt(driver.length);
        hsl.drivers.setText(driver[id]);
        hsl.drivers.setEditable(false);
            
            hsl.setVisible(true);
            hsl.setData1(nama);
            hsl.setData(asal);
            hsl.setData2(destinasi);
            hsl.setData3(alamat);
            
            switch(asal2){
              
              case "Jakarta":
                  switch(dest){
                      case "Bogor":
                          jarak = 56.2;
                          break;
                      case "Depok":
                          jarak = 26.7;
                          break;
                      case "Tangerang":
                          jarak = 30.1;
                          break;
                      case "Bekasi":
                          jarak = 27.9;
                          break;
                  } 
                  break;
              case "Bogor":
                  switch(dest){
                      case "Jakarta":
                          jarak = 56.2;
                          break;
                      case "Depok":
                          jarak = 44;
                          break;
                      case "Tangerang":
                          jarak = 82.1;
                          break;
                      case "Bekasi":
                          jarak = 53.4;
                          break;
                  }
                  break;
               case "Depok":
                  switch(dest){
                      case "Jakarta":
                          jarak = 26.7;
                          break;
                      case "Bogor":
                          jarak = 44;
                          break;
                      case "Tangerang":
                          jarak = 46.3;
                          break;
                      case "Bekasi":
                          jarak = 39;
                          break;
                  }
                  break;
                  case "Tangerang":
                  switch(dest){
                      case "Jakarta":
                          jarak = 30.1;
                          break;
                      case "Bogor":
                          jarak = 82.1;
                          break;
                      case "Depok":
                          jarak = 46.3;
                          break;
                      case "Bekasi":
                          jarak = 54.2;
                          break;
                  }
                  break;
                  case "Bekasi":
                  switch(dest){
                      case "Jakarta":
                          jarak = 27.9;
                          break;
                      case "Bogor":
                          jarak = 53.4;
                          break;
                      case "Tangerang":
                          jarak = 54.2;
                          break;
                      case "Depok":
                          jarak = 39;
                          break;
                          
                  }
                    
          }
            
          hsl.jar.setText(String.valueOf(jarak) +" KM");
          hsl.jar.setEditable(false);
          harga=jarak*10;
          total= harga - 50;
          hsl.har.setText("Rp "+String.valueOf(total) +"00");
          hsl.har.setEditable(false);
        }
            
         else{
            JOptionPane.showMessageDialog(null, "Maaf username dan password salah");
            
        }   
        }
        else{
            i=1;

        }
            }while(i==0);
      }else{

          switch(asal2){
              
              case "Jakarta":
                  switch(dest){
                      case "Bogor":
                          jarak = 56.2;
                          break;
                      case "Depok":
                          jarak = 26.7;
                          break;
                      case "Tangerang":
                          jarak = 30.1;
                          break;
                      case "Bekasi":
                          jarak = 27.9;
                          break;
                  } 
                  break;
              case "Bogor":
                  switch(dest){
                      case "Jakarta":
                          jarak = 56.2;
                          break;
                      case "Depok":
                          jarak = 44;
                          break;
                      case "Tangerang":
                          jarak = 82.1;
                          break;
                      case "Bekasi":
                          jarak = 53.4;
                          break;
                  }
                  break;
               case "Depok":
                  switch(dest){
                      case "Jakarta":
                          jarak = 26.7;
                          break;
                      case "Bogor":
                          jarak = 44;
                          break;
                      case "Tangerang":
                          jarak = 46.3;
                          break;
                      case "Bekasi":
                          jarak = 39;
                          break;
                  }
                  break;
                  case "Tangerang":
                  switch(dest){
                      case "Jakarta":
                          jarak = 30.1;
                          break;
                      case "Bogor":
                          jarak = 82.1;
                          break;
                      case "Depok":
                          jarak = 46.3;
                          break;
                      case "Bekasi":
                          jarak = 54.2;
                          break;
                  }
                  break;
                  case "Bekasi":
                  switch(dest){
                      case "Jakarta":
                          jarak = 27.9;
                         // harga = 279;
                          break;
                      case "Bogor":
                          jarak = 53.4;
                          break;
                      case "Tangerang":
                          jarak = 54.2;
                          break;
                      case "Depok":
                          jarak = 39;
                          break;
                          
                  }
                    
          }
          
          hsl.jar.setText(String.valueOf(jarak) +" KM");
          hsl.jar.setEditable(false);
          harga=jarak*10;
          hsl.har.setText("Rp "+String.valueOf(harga) +"00");
          hsl.har.setEditable(false);
          
        String[] driver = new String[]{
        "Pak Jarmo" ,"Pak Kimin" ,"Pak Owi","Pak Darto"
                ,"Pak Kanwo" ,"Pak Ambatu" , "Pak Lawu"
        };
        
        Random r = new Random();
        int id = r.nextInt(driver.length);
        hsl.drivers.setText(driver[id]);
        hsl.drivers.setEditable(false);
        
         hsl.setVisible(true);
         hsl.setData1(nama);
         hsl.setData(asal);
         hsl.setData2(destinasi);
         hsl.setData3(alamat);
         
         
      }
    } 
