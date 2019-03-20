package com.example.slabiak.appointmentscheduler.service;

import com.example.slabiak.appointmentscheduler.entity.Appointment;
import com.example.slabiak.appointmentscheduler.entity.Invoice;
import org.thymeleaf.context.Context;

import java.io.File;
import java.util.Map;

public interface EmailService {

    public void sendEmail(String to, String subject, String template, Context context, File attachment);
    public void sendFinishedAppointmentNotification(Appointment appointment);
    public void sendDeniedAppointmentNotification(Appointment appointment);
    void sendInvoice(Invoice invoice);
}