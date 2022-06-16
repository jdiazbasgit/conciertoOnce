export class DTOCalendar{
    day:number;
    month:number;
    year:number;
    dayOfWeek:number;
	weekOfMonth:number;
    //state:State
    //calendarType:CalendarType
    //employeeJournal:EmployeeJournal
    

    //constructor temporal: pendiente por meter la propiedades... 
    constructor(day:number,month:number,year:number,dayOfWeek:number,weekOfMonth:number){
        this.day=day
        this.month = month
        this.year=year
        this.dayOfWeek=dayOfWeek
        this.weekOfMonth=weekOfMonth;
    }
}
export default DTOCalendar;