using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Model
{
    public enum PaymentStatus
    {
        Success,
        InvalidAmount,
        InsufficientFunds
    }
    public class PaymentResult
    {
        public PaymentStatus PaymentStatus { get; set; }
        public decimal Change { get; set; }
    }
}
