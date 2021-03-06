
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 * @author Alaa Mahmoud Ebrahim     20190105
 * @author Rana Ihab Ahmed          20190207
 * @author Rana Hisham              20190209
 * @author Doha Ramadan Hanafy      20190271
 * @author Omar Khaled Al Haj       20190351
 * @author Nada Emam Hanafy Azoz    20190579
 */
public class Main extends javax.swing.JFrame {

    DefaultTableModel tableModel;
    ArrayList<Process> processArrayList;

    public Main() {
        initComponents();
        tableModel = (DefaultTableModel) jTable1.getModel();
        jTable1.setModel(tableModel);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ScheduleName = new javax.swing.JLabel();
        AWT = new javax.swing.JLabel();
        ATAT = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(0, 0, 0));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Process", "Color", "Name", "PID", "Priority"
                }
        ));
        jTable1.setToolTipText("Process");
        jTable1.setColumnSelectionAllowed(true);
        jTable1.setEditingColumn(1);
        jTable1.setEditingRow(1);
        jTable1.setName("panel"); // NOI18N
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Schedule Name: ");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("AWT: ");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ATAT: ");

        ScheduleName.setForeground(new java.awt.Color(255, 255, 255));
        ScheduleName.setText("sn");

        AWT.setForeground(new java.awt.Color(255, 255, 255));
        AWT.setText("0.0");

        ATAT.setForeground(new java.awt.Color(255, 255, 255));
        ATAT.setText("0.0");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Statistics");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ATAT))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ScheduleName))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(AWT)))
                                .addContainerGap(495, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(ScheduleName))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(AWT))
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(ATAT))
                                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Processes Information");

        jButton1.setText("click here to show the CPU Scheduling Graph");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton1))
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(38, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                                                .addGap(139, 139, 139))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(137, 137, 137)
                                                .addComponent(jButton1)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap(330, Short.MAX_VALUE)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap()))
        );

        pack();
    }// </editor-fold>

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        GanttChart gc = new GanttChart("CPU Scheduling Graph", processArrayList);
    }



    public static int menu() {
        int num;

        System.out.println("1- SJF");
        System.out.println("2- SRTF");
        System.out.println("3- Priority Scheduler ");
        System.out.println("4- AG Scheduler ");

        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        return num;

    }
    public static void main(String args[]) {


        Main mainMethod = new Main();

        mainMethod.processArrayList = new ArrayList<>();
        String name;
        String color;
        int arrivalTime;
        int burstTime;
        int priorityNum;

        Scanner input = new Scanner(System.in);

        int numOfProcess;
        int rrQuantum;
        int contextProcess;
        int choiceNum;

        System.out.println("Enter number of processes");
        numOfProcess = input.nextInt();


        System.out.println("Enter Context Switching ");
        contextProcess = input.nextInt();

        for (int i = 0; i < numOfProcess; i++) {
            System.out.println("Enter the process properties is this order space separated: name, color, arrival time, burst time,process priority and process quantum");
            name = input.next();
            color = input.next();
            arrivalTime = input.nextInt();
            burstTime = input.nextInt();
            priorityNum = input.nextInt();
            rrQuantum = input.nextInt();

            Process p = new Process(name, color, arrivalTime, burstTime, priorityNum, rrQuantum);
            mainMethod.processArrayList.add(p);
        }

        choiceNum = menu();

        if (choiceNum == 1){
            SJF  sjf = new SJF (  mainMethod.processArrayList );
            sjf.startScheduling ();
            for(int i =0; i<mainMethod.processArrayList.size(); i++){
                Process p = mainMethod.processArrayList.get(i);
                System.out.println(p.getName() +": Waiting Time= " + p.waitingTime+" || Turnaround Time= " + p.getTurnaroundTime());
            }
            System.out.println ("Average Waiting time : "+ sjf.getAverageWaitingTime () );
            System.out.println ("Average Turnaround time : "+sjf.getAverageTurnaroundTime () );
            mainMethod.AWT.setText(sjf.getAverageWaitingTime() + "");
            mainMethod.ATAT.setText(sjf.getAverageTurnaroundTime () + "");
            mainMethod.ScheduleName.setText("SJFSchedule");

        }

        if (choiceNum == 2){
            SRTF srtf = new SRTF(mainMethod.processArrayList,contextProcess);
            srtf.start();
            System.out.println ("Average Waiting time : "+ srtf.getAverageWaitingTime () );
            System.out.println ("Average Turnaround time : "+srtf.getAverageTurnaroundTime () );
            for(int i =0; i<mainMethod.processArrayList.size(); i++){
                Process p = mainMethod.processArrayList.get(i);
                System.out.println(p.getName() +": Waiting Time= " + p.waitingTime+" || Turnaround Time= " + p.getTurnaroundTime());
            }
            mainMethod.AWT.setText(srtf.getAverageWaitingTime() + "");
            mainMethod.ATAT.setText(srtf.getAverageTurnaroundTime () + "");
            mainMethod.ScheduleName.setText("SRTFSchedule");
        }

        if (choiceNum == 3){
            PriorityScheduling pScheduling = new PriorityScheduling( mainMethod.processArrayList,contextProcess);
            pScheduling.start();
            System.out.println( "\nAverage Waiting Time :  " + pScheduling.getAverageWaitingTime());
            System.out.println("Average Turnaround Time :" + pScheduling.getAverageTurnaroundTime() + "\n");
            mainMethod.processArrayList = pScheduling.getExecutedProcesses();
            mainMethod.ScheduleName.setText("PrioritySchedule");
            mainMethod.AWT.setText(pScheduling.getAverageWaitingTime() + "");
            mainMethod.ATAT.setText(pScheduling.getAverageTurnaroundTime () + "");
        }

        if (choiceNum == 4) {
            AGAT a = new AGAT( mainMethod.processArrayList);
            a.printInfo();
            for(int i = 0; i <  mainMethod.processArrayList.size(); i++){
                System.out.print( mainMethod.processArrayList.get(i).getName() +" Factor- ");
                for(int j =0; j< mainMethod.processArrayList.get(i).AGAT.size(); j++){
                    System.out.print( mainMethod.processArrayList.get(i).AGAT.get(j)+" ");
                }
                System.out.println();
                System.out.print( mainMethod.processArrayList.get(i).getName() +" Quantum- ");
                for(int j =0; j< mainMethod.processArrayList.get(i).quantumTime.size(); j++){
                    System.out.print( mainMethod.processArrayList.get(i).quantumTime.get(j)+" ");
                }
                System.out.println();

            }
            mainMethod.ScheduleName.setText("AGATSchedule");
            mainMethod.AWT.setText(a.getAverageWaitingTime () + "");
            mainMethod.ATAT.setText( a.getAverageTurnaroundTime () + "");
        }


        for (Process process :  mainMethod.processArrayList) {
            mainMethod.tableModel.addRow(new Object[]{
                    mainMethod.processArrayList.indexOf(process), process.getColor(), process.getName(), process.getpID(), process.getPriority()
            });
        }

        mainMethod.tableModel.fireTableDataChanged();
        mainMethod.setLocationRelativeTo(null);
        mainMethod.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainMethod.setVisible(true);


    }

    // Variables declaration - do not modify
    private javax.swing.JLabel ATAT;
    private javax.swing.JLabel AWT;
    private javax.swing.JLabel ScheduleName;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration
}





