class Badge {
    public String print(Integer id, String name, String department) {

        // #1
        if(id != null && name!= null && department != null ){
            return "["+id+"] - " + name + " - " + department.toUpperCase();
        }

        //#2
        if(id == null && name!= null && department != null ){
            return name + " - " + department.toUpperCase();
        }

        //#3

        if(department == null ){

            if(id != null){
                return "["+id+"] - " + name + " - " + "OWNER";

            }else{
                return  name + " - " + "OWNER";

            }
        }

        return name;
    }
}
