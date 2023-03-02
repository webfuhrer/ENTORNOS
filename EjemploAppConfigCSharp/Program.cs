using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Configuration;
namespace EjemploMVC
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //D:/ficheroconfig.xml


            string nombre=(string)ConfigurationManager.AppSettings["bicho1"];
            string nombre2 = (string)ConfigurationManager.AppSettings["bicho2"];
            string imagen1 = (string)ConfigurationManager.AppSettings["imagen1"];
            string imagen2 = (string)ConfigurationManager.AppSettings["imagen2"];
            Console.WriteLine("El bicho1 se llama: "+nombre+" y su imagen: "+imagen1); ;

            Console.WriteLine("El bicho2 se llama: " + nombre2 + " y su imagen: " + imagen2); ;
            Console.ReadLine();
        }
    }
}
