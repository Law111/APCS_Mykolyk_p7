public String doubleChar(String str) {
  String thing = "";
  for(int i=0; i<str.length(); i++){
    thing = thing + str.charAt(i) + str.charAt(i);
  }
  return thing;
}

